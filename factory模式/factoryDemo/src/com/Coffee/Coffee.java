package com.Coffee;

public abstract class Coffee {
	 /**
     * ��ȡcoffee����
     * @return
     */
    public abstract String getName();

	
}


/**
 * ��ʽ����
 * 
 *
 */



 class Americano extends Coffee {

    @Override
    public String getName() {
        return "��ʽ����";
    }

}
 
 /**
  * ������ŵ
  * 
  *
  */
 
  class Cappuccino extends Coffee {

	    @Override
	    public String getName() {
	        return "������ŵ";
	    }

	}
  
  
  
  /**
   * ����
   * 
   *
   */
  
   class Latte extends Coffee {

	    @Override
	    public String getName() {
	        return "����";
	    }

	}




