package leader;

public class Master {
    public void log(){
        System.out.println("初次提交，自我介绍");
        System.out.println("Rebased change2_1 on master");
        System.out.println("merge group1 into master");
        System.out.println("master上线，提交规范化开始");
        System.out.println("接收2组的两次提交");
        System.out.println("merge change2 into master");
        System.out.println("master的2组并没有更新");
        System.out.println("刚刚2组更新弹窗选择选错了，那个意思是忽略，操，");
        System.out.println("master刚刚的操作再次丢失了，");
        System.out.println("丢失操作如下" +
                "Rebase change2_1 on master" +
                "log merge and rebase" +
                "merge change2 into master" +
                "log merge2 failed");
        System.out.println("获取二组第四次更新" +
                "merge change2 into master");
        System.out.println("更新成功，不仅第四次，2-3次更新也同步了");
    }
}
