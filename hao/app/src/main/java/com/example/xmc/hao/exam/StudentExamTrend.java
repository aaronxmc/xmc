package com.example.xmc.hao.exam;


import java.util.List;

/**
 * Created by xmc on 2017/7/13.
 */

public class StudentExamTrend {


    /**
     * code : 0
     * msg : 获取一名学生成绩趋势信息成功
     * data : {"trends":[{"examId":"26270","name":"成章2016上期八年级生地综合模拟考试","type":5,"score":173,"time":1465370940000,"manfen":200,"classRank":41,"level":27.86,"className":"253"},{"examId":"20313","name":"成章2016上期八年级期中考试","type":1,"score":676,"time":1461896100000,"manfen":960,"classRank":41,"level":26.83,"className":"253"},{"examId":"14747","name":"成章2016上期八年级第一次阶段考试","type":3,"score":501,"time":1459322100000,"manfen":760,"classRank":40,"level":31.11,"className":"253"},{"examId":"9380","name":"成章中学2015年下学期初二期末考试","type":2,"score":699,"time":1452763020000,"manfen":960,"classRank":40,"level":31.26,"className":"253"},{"examId":"3171","name":"2015下成章八年级期中考试","type":1,"score":735,"time":1447122000000,"manfen":960,"classRank":35,"level":37.4,"className":"253"},{"examId":"1001","name":"2015下成章八年级月考","type":3,"score":350,"time":1444362000000,"manfen":460,"classRank":25,"level":53.49,"className":"253"},{"examId":"664","name":"2015年下学期初中一年级期末考试","type":2,"score":599,"time":1436228400000,"manfen":760,"classRank":23,"level":51.47,"className":"253"},{"examId":"662","name":"2015年下学期初中一年级期中考试","type":1,"score":540,"time":1430887140000,"manfen":760,"classRank":34,"level":35.05,"className":"253"},{"examId":"661","name":"2015年4月初中一年级月考","type":3,"score":285,"time":1428029220000,"manfen":360,"classRank":14,"level":66.24,"className":"253"},{"examId":"660","name":"2015年上学期初中一年级期末考试","type":2,"score":569,"time":1421884800000,"manfen":762,"classRank":36,"level":37.63,"className":"253"},{"examId":"658","name":"2014年上学期初中一年级期中考试","type":1,"score":545,"time":1415843820000,"manfen":760,"classRank":40,"level":34.94,"className":"253"},{"examId":"657","name":"2014年10月初中一年级月考","type":3,"score":281,"time":1412996400000,"manfen":340,"classRank":15,"level":73.03,"className":"253"}],"examOverview":{"score":173,"badge":[5,4],"growUp":3,"teacherComment":2,"weakAdvantage":[[],[]],"questionStats":[21,6,0],"canRiseScore":0,"canRiseRank":0,"classRank":41,"manfen":200,"signStatus":1,"papers":[{"paperId":"110724-17","manfen":100,"name":"成章2016上期八年级生地综合模拟考试地理","subject":"地理","score":85,"teacherComment":2,"transScore":2,"canRiseScore":-2,"weakAdvantage":2,"visible":1},{"paperId":"110725-17","manfen":100,"name":"成章2016上期八年级生地综合模拟考试生物","subject":"生物","score":88,"teacherComment":2,"transScore":2,"canRiseScore":1,"weakAdvantage":2,"visible":1}],"visible":1}}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * trends : [{"examId":"26270","name":"成章2016上期八年级生地综合模拟考试","type":5,"score":173,"time":1465370940000,"manfen":200,"classRank":41,"level":27.86,"className":"253"},{"examId":"20313","name":"成章2016上期八年级期中考试","type":1,"score":676,"time":1461896100000,"manfen":960,"classRank":41,"level":26.83,"className":"253"},{"examId":"14747","name":"成章2016上期八年级第一次阶段考试","type":3,"score":501,"time":1459322100000,"manfen":760,"classRank":40,"level":31.11,"className":"253"},{"examId":"9380","name":"成章中学2015年下学期初二期末考试","type":2,"score":699,"time":1452763020000,"manfen":960,"classRank":40,"level":31.26,"className":"253"},{"examId":"3171","name":"2015下成章八年级期中考试","type":1,"score":735,"time":1447122000000,"manfen":960,"classRank":35,"level":37.4,"className":"253"},{"examId":"1001","name":"2015下成章八年级月考","type":3,"score":350,"time":1444362000000,"manfen":460,"classRank":25,"level":53.49,"className":"253"},{"examId":"664","name":"2015年下学期初中一年级期末考试","type":2,"score":599,"time":1436228400000,"manfen":760,"classRank":23,"level":51.47,"className":"253"},{"examId":"662","name":"2015年下学期初中一年级期中考试","type":1,"score":540,"time":1430887140000,"manfen":760,"classRank":34,"level":35.05,"className":"253"},{"examId":"661","name":"2015年4月初中一年级月考","type":3,"score":285,"time":1428029220000,"manfen":360,"classRank":14,"level":66.24,"className":"253"},{"examId":"660","name":"2015年上学期初中一年级期末考试","type":2,"score":569,"time":1421884800000,"manfen":762,"classRank":36,"level":37.63,"className":"253"},{"examId":"658","name":"2014年上学期初中一年级期中考试","type":1,"score":545,"time":1415843820000,"manfen":760,"classRank":40,"level":34.94,"className":"253"},{"examId":"657","name":"2014年10月初中一年级月考","type":3,"score":281,"time":1412996400000,"manfen":340,"classRank":15,"level":73.03,"className":"253"}]
         * examOverview : {"score":173,"badge":[5,4],"growUp":3,"teacherComment":2,"weakAdvantage":[[],[]],"questionStats":[21,6,0],"canRiseScore":0,"canRiseRank":0,"classRank":41,"manfen":200,"signStatus":1,"papers":[{"paperId":"110724-17","manfen":100,"name":"成章2016上期八年级生地综合模拟考试地理","subject":"地理","score":85,"teacherComment":2,"transScore":2,"canRiseScore":-2,"weakAdvantage":2,"visible":1},{"paperId":"110725-17","manfen":100,"name":"成章2016上期八年级生地综合模拟考试生物","subject":"生物","score":88,"teacherComment":2,"transScore":2,"canRiseScore":1,"weakAdvantage":2,"visible":1}],"visible":1}
         */

        private ExamOverviewBean examOverview;
        private List<TrendsBean> trends;

        public ExamOverviewBean getExamOverview() {
            return examOverview;
        }

        public void setExamOverview(ExamOverviewBean examOverview) {
            this.examOverview = examOverview;
        }

        public List<TrendsBean> getTrends() {
            return trends;
        }

        public void setTrends(List<TrendsBean> trends) {
            this.trends = trends;
        }

        public static class ExamOverviewBean {
            /**
             * score : 173
             * badge : [5,4]
             * growUp : 3
             * teacherComment : 2
             * weakAdvantage : [[],[]]
             * questionStats : [21,6,0]
             * canRiseScore : 0
             * canRiseRank : 0
             * classRank : 41
             * manfen : 200
             * signStatus : 1
             * papers : [{"paperId":"110724-17","manfen":100,"name":"成章2016上期八年级生地综合模拟考试地理","subject":"地理","score":85,"teacherComment":2,"transScore":2,"canRiseScore":-2,"weakAdvantage":2,"visible":1},{"paperId":"110725-17","manfen":100,"name":"成章2016上期八年级生地综合模拟考试生物","subject":"生物","score":88,"teacherComment":2,"transScore":2,"canRiseScore":1,"weakAdvantage":2,"visible":1}]
             * visible : 1
             */

            private int score;
            private int growUp;
            private int teacherComment;
            private int canRiseScore;
            private int canRiseRank;
            private int classRank;
            private int manfen;
            private int signStatus;
            private int visible;
            private List<Integer> badge;
            private List<List<?>> weakAdvantage;
            private List<Integer> questionStats;
            private List<PapersBean> papers;

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public int getGrowUp() {
                return growUp;
            }

            public void setGrowUp(int growUp) {
                this.growUp = growUp;
            }

            public int getTeacherComment() {
                return teacherComment;
            }

            public void setTeacherComment(int teacherComment) {
                this.teacherComment = teacherComment;
            }

            public int getCanRiseScore() {
                return canRiseScore;
            }

            public void setCanRiseScore(int canRiseScore) {
                this.canRiseScore = canRiseScore;
            }

            public int getCanRiseRank() {
                return canRiseRank;
            }

            public void setCanRiseRank(int canRiseRank) {
                this.canRiseRank = canRiseRank;
            }

            public int getClassRank() {
                return classRank;
            }

            public void setClassRank(int classRank) {
                this.classRank = classRank;
            }

            public int getManfen() {
                return manfen;
            }

            public void setManfen(int manfen) {
                this.manfen = manfen;
            }

            public int getSignStatus() {
                return signStatus;
            }

            public void setSignStatus(int signStatus) {
                this.signStatus = signStatus;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public List<Integer> getBadge() {
                return badge;
            }

            public void setBadge(List<Integer> badge) {
                this.badge = badge;
            }

            public List<List<?>> getWeakAdvantage() {
                return weakAdvantage;
            }

            public void setWeakAdvantage(List<List<?>> weakAdvantage) {
                this.weakAdvantage = weakAdvantage;
            }

            public List<Integer> getQuestionStats() {
                return questionStats;
            }

            public void setQuestionStats(List<Integer> questionStats) {
                this.questionStats = questionStats;
            }

            public List<PapersBean> getPapers() {
                return papers;
            }

            public void setPapers(List<PapersBean> papers) {
                this.papers = papers;
            }

            public static class PapersBean {
                /**
                 * paperId : 110724-17
                 * manfen : 100
                 * name : 成章2016上期八年级生地综合模拟考试地理
                 * subject : 地理
                 * score : 85
                 * teacherComment : 2
                 * transScore : 2
                 * canRiseScore : -2
                 * weakAdvantage : 2
                 * visible : 1
                 */

                private String paperId;
                private int manfen;
                private String name;
                private String subject;
                private int score;
                private int teacherComment;
                private int transScore;
                private int canRiseScore;
                private int weakAdvantage;
                private int visible;

                public String getPaperId() {
                    return paperId;
                }

                public void setPaperId(String paperId) {
                    this.paperId = paperId;
                }

                public int getManfen() {
                    return manfen;
                }

                public void setManfen(int manfen) {
                    this.manfen = manfen;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getSubject() {
                    return subject;
                }

                public void setSubject(String subject) {
                    this.subject = subject;
                }

                public int getScore() {
                    return score;
                }

                public void setScore(int score) {
                    this.score = score;
                }

                public int getTeacherComment() {
                    return teacherComment;
                }

                public void setTeacherComment(int teacherComment) {
                    this.teacherComment = teacherComment;
                }

                public int getTransScore() {
                    return transScore;
                }

                public void setTransScore(int transScore) {
                    this.transScore = transScore;
                }

                public int getCanRiseScore() {
                    return canRiseScore;
                }

                public void setCanRiseScore(int canRiseScore) {
                    this.canRiseScore = canRiseScore;
                }

                public int getWeakAdvantage() {
                    return weakAdvantage;
                }

                public void setWeakAdvantage(int weakAdvantage) {
                    this.weakAdvantage = weakAdvantage;
                }

                public int getVisible() {
                    return visible;
                }

                public void setVisible(int visible) {
                    this.visible = visible;
                }
            }
        }

        public static class TrendsBean {
            /**
             * examId : 26270
             * name : 成章2016上期八年级生地综合模拟考试
             * type : 5
             * score : 173
             * time : 1465370940000
             * manfen : 200
             * classRank : 41
             * level : 27.86
             * className : 253
             */

            private String examId;
            private String name;
            private int type;
            private int score;
            private long time;
            private int manfen;
            private int classRank;
            private double level;
            private String className;

            public String getExamId() {
                return examId;
            }

            public void setExamId(String examId) {
                this.examId = examId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public long getTime() {
                return time;
            }

            public void setTime(long time) {
                this.time = time;
            }

            public int getManfen() {
                return manfen;
            }

            public void setManfen(int manfen) {
                this.manfen = manfen;
            }

            public int getClassRank() {
                return classRank;
            }

            public void setClassRank(int classRank) {
                this.classRank = classRank;
            }

            public double getLevel() {
                return level;
            }

            public void setLevel(double level) {
                this.level = level;
            }

            public String getClassName() {
                return className;
            }

            public void setClassName(String className) {
                this.className = className;
            }
        }
    }
}
