package com.Coffee;
/**
 * 简单工厂--用于创建不同类型的咖啡实例
 * 
 *
 */
public class SimpleFactory {
	/**
     * 通过类型获取Coffee实例对象
     * @param type 咖啡类型
     * @return
     */
    public static Coffee createInstance(String type){
        if("americano".equals(type)){
            return new Americano();
        }else if("cappuccino".equals(type)){
            return new Cappuccino();
        }else if("latte".equals(type)){
            return new Latte();
        }else{
            throw new RuntimeException("type["+type+"]类型不可识别，没有匹配到可实例化的对象！");
        }
    }
    
    public static void main(String[] args) {
        Coffee latte = SimpleFactory.createInstance("latte");
        System.out.println("创建的咖啡实例为:" + latte.getName());
        Coffee cappuccino = SimpleFactory.createInstance("cappuccino");
        System.out.println("创建的咖啡实例为:" + cappuccino.getName());
    }

}
