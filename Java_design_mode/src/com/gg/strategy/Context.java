package com.gg.strategy;

/**
 * 　环境(Context)角色：持有一个Strategy的引用。
 * @author shiweibo
 *
 * 2018年5月16日
 */
public class Context {

	 //持有一个具体策略的对象
    private Strategy strategy;
    /**
     * 构造函数，传入一个具体策略对象
     * 客户端指定使用什么策略，这样客户端就需要知道所有的策略，但是不知道实现
     * @param strategy    具体策略对象
     */
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    /**
     * 策略方法
     */
    public void contextInterface(){
        
        strategy.strategyInterface();
    }

}
