package com.bionic.edu;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Named
public class Application{
	@Inject
    MerchantService merchantService;
	@Inject
    PaymentService paymentService;
	@Inject
    CustomerService customerService;

    @SuppressWarnings("resource")
    public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-config.xml");
    	Application application = (Application)context.getBean("application");
    	//application.findAll();
    	//application.getPaymentsForMerchant(3);
    	//application.getCustomersWithLargePays(500.0);
    	//application.getPaymentSum();
    	//application.getSumToPay();
    	application.getTotalReport();
     }
    
   /* public void printMerchantName(int id){
        Merchant m1 = merchantService.findById(id);
        System.out.println("name = " + m1.getName());     	
    }
    
    public int addMerchant(){
    	Merchant merchant = new Merchant();
    	merchant.setAccount("555555555");
    	merchant.setBankName("Erste Bank");
    	merchant.setCharge(1.2);
    	merchant.setMinSum(145.0);
    	merchant.setName("N&M");
    	merchant.setPeriod((short)1);
    	merchant.setSwift("X85T44wwq");
    	merchantService.save(merchant);
    	return merchant.getId();
    }
    
    public void removeMerchant(int id){
    	merchantService.remove(id);
    }
    
    public void upadateAccount(){
    	merchantService.updateAccount(2, "5555555555");
    }*/
    /*
    public void findAll(){
    	List<Merchant> list = merchantService.findAll();
    	System.out.println("           name              charge");
        for(Merchant m: list){
        	System.out.format("%1$25s     %2$4.1f  %n", m.getName(), m.getCharge());
        }
    }
    
    public void getPaymentsForMerchant(int id){
    	List<Payment> list = paymentService.findByMerchantId(id);
    	System.out.println("        date        merchant   sum  ");
    	for(Payment p: list){
    		SimpleDateFormat dtFrm = new SimpleDateFormat("dd.MM.yyyy HH:mm"); 
    		String txDate = dtFrm.format(p.getDt());
    	   	System.out.format("  %1s   %2$3d     %3$6.2f   %n", txDate, p.getMerchantId(), p.getSumPayed());
    	}
    }*/
    
   /* public void getCustomersWithLargePays(double limit){
    	List<String> list = customerService.getNames(limit);
        for(String s: list)
        	System.out.println(s); 
    }*/
    /*
    public void getPaymentSum(){
    	double sum = paymentService.getPaymentSum();
        System.out.println("total = " + sum); 
    }*/
    /*
    public void getSumToPay(){
    	List<Merchant> list = merchantService.getSortedByNeedToPay();
    	System.out.println("        Merchant           Sum to Pay");
        for(Merchant m: list){
           	System.out.format("%1$-25s  %2$8.2f  %n", m.getName(), m .getNeedToSend()); 
        }
    }
    */
    public void getTotalReport(){
    	List<Result> list = merchantService.getTotalReport();
        for(Result r: list)
        	System.out.format("%1$25d  %2$-25s %3$5f %4$1f %2$-25s %n", r.getId(), r.getName(), r.getMinSum(), r.getSum(), r.getNeedToSend()); 
    }
 }
