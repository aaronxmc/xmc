/***

使用方法：

 1、 复制excel内容到剪贴板，excel格式： 学校、姓名、studid，年级 班级 金额 方式 来院 时间
 1、 node yq.js | iconv -f utf8 -t gbk > ~/Desktop/out.csv 

**/


var ncp = require("copy-paste");
var moment=require('moment')
var d1 = moment('2016-04-01');
var d2 = moment('2016-05-18');


ncp.paste((a1,data)=>{
    var ret={};
    var rows = data.split("\r");
    rows.forEach((row,index)=>{
        var cols = [index+1].concat(row.split("\t"));
        var id=cols[0],school=cols[1],name=cols[2],studid=cols[3],
            grade=cols[4],classname=cols[5],pay=cols[6],payway=cols[7],
            source=cols[8],time=cols[9];
        var daym = moment(new Date(time));
        var day=daym.format("YYYY-MM-DD")
        if (!(school in ret)){
            ret[school]={school,total:0,detail:{}}
        }
        if (!(day in ret[school].detail)){
            ret[school].detail[day]=[];
        }
        var paynum = Number(pay);
        if (isNaN(paynum)){
            paynum = 0;
        }
        ret[school].detail[day].push({pay:paynum,id});
        if (daym.isBetween(d1,d2)) ret[school].total += paynum;
    });

    var schools = Object.keys(ret).sort((a,b)=>{return ret[b].total - ret[a].total }).slice(0,50);
    
    console.log(['日期'].concat(schools).join(","));
    for (var m = d1; m.isBefore(d2); m.add(1, 'days')) {
      var day = m.format('YYYY-MM-DD');
      var retrow = [day].concat(schools.map((school)=>{
         var result = 0;
         if (day in ret[school].detail){
             //result = ret[school].detail[day].length;
             ret[school].detail[day].forEach((row)=>{
                result += row.pay;
             })
         }
         return result;
      }));
      console.log(retrow.join(","));
    }

    console.log(['total'].concat(schools.map((school)=>{return ret[school].total})).join(","));

})

