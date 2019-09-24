package com.Coffee;
/**
 * 定义一个抽象的咖啡工厂
 * 
 */
public abstract  class CoffeeFactory {
	 /**
     * 生产可制造的咖啡
     * @return
     */
    public abstract Coffee[] createCoffee();


}

/**
 * 中国咖啡工厂
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
  * 美国咖啡工厂
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
   * 工厂方法测试
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
          System.out.println("中国咖啡工厂可以生产的咖啡有：");
          print(chinaCoffees);
          CoffeeFactory americaCoffeeFactory = new AmericaCoffeeFactory();
          Coffee[] americaCoffees = americaCoffeeFactory.createCoffee();
          System.out.println("美国咖啡工厂可以生产的咖啡有：");
          print(americaCoffees);
      }
  }

