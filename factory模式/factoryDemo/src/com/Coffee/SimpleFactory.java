package com.Coffee;
/**
 * �򵥹���--���ڴ�����ͬ���͵Ŀ���ʵ��
 * 
 *
 */
public class SimpleFactory {
	/**
     * ͨ�����ͻ�ȡCoffeeʵ������
     * @param type ��������
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
            throw new RuntimeException("type["+type+"]���Ͳ���ʶ��û��ƥ�䵽��ʵ�����Ķ���");
        }
    }
    
    public static void main(String[] args) {
        Coffee latte = SimpleFactory.createInstance("latte");
        System.out.println("�����Ŀ���ʵ��Ϊ:" + latte.getName());
        Coffee cappuccino = SimpleFactory.createInstance("cappuccino");
        System.out.println("�����Ŀ���ʵ��Ϊ:" + cappuccino.getName());
    }

}
