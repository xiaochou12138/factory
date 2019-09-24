package com.Coffee;
/**
 * ����һ������Ŀ��ȹ���
 * 
 */
public abstract  class CoffeeFactory {
	 /**
     * ����������Ŀ���
     * @return
     */
    public abstract Coffee[] createCoffee();


}

/**
 * �й����ȹ���
 * 
 *
 */
 class ChinaCoffeeFactory extends CoffeeFactory {

    @Override
    public Coffee[] createCoffee() {
        // TODO Auto-generated method stub
        return new Coffee[]{new Cappuccino(), new Latte()};
    }

}

 
 /**
  * �������ȹ���
  *
  *
  */
  class AmericaCoffeeFactory extends CoffeeFactory {

     @Override
     public Coffee[] createCoffee() {
         // TODO Auto-generated method stub
         return new Coffee[]{new Americano(), new Latte()};
     }

 }
  
  /**
   * ������������
   * 
   *
   */
   class FactoryMethodTest {

      static void print(Coffee[] c){
          for (Coffee coffee : c) {
              System.out.println(coffee.getName());
          }
      }
      
      public static void main(String[] args) {
          CoffeeFactory chinaCoffeeFactory = new ChinaCoffeeFactory();
          Coffee[] chinaCoffees = chinaCoffeeFactory.createCoffee();
          System.out.println("�й����ȹ������������Ŀ����У�");
          print(chinaCoffees);
          CoffeeFactory americaCoffeeFactory = new AmericaCoffeeFactory();
          Coffee[] americaCoffees = americaCoffeeFactory.createCoffee();
          System.out.println("�������ȹ������������Ŀ����У�");
          print(americaCoffees);
      }
  }

