package com.Coffee;

public abstract class Coffee {
	 /**
     * 获取coffee名称
     * @return
     */
    public abstract String getName();

	
}


/**
 * 美式咖啡
 * 
 *
 */



 class Americano extends Coffee {

    @Override
    public String getName() {
        return "美式咖啡";
    }

}
 
 /**
  * 卡布奇诺
  * 
  *
  */
 
  class Cappuccino extends Coffee {

	    @Override
	    public String getName() {
	        return "卡布奇诺";
	    }

	}
  
  
  
  /**
   * 拿铁
   * 
   *
   */
  
   class Latte extends Coffee {

	    @Override
	    public String getName() {
	        return "拿铁";
	    }

	}




