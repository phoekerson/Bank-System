package project;

public class Account {
	private String proprietaire;
	private int numero_account;
	private int identite_numerique;
	private double amount;
	private String currency;
	
	public Account(String proprietaire, int numero_account, int identite_numerique, double amount, String currency) {
		this.proprietaire = proprietaire;
		this.numero_account=numero_account;
		this.identite_numerique=identite_numerique;
		this.amount=amount;
		this.currency=currency;
	}
	
	public String getProprietaire() {
		return proprietaire;
	}
	public int numero_account() {
		return numero_account;
	}
	public int identite_numerique() {
		return identite_numerique;
	}
	public double amount() {
		return amount;
	}
	public String currency() {
		return currency;
	}
	public void setProprietaire(String proprietaire) {
		this.proprietaire+=proprietaire;
	}
	public void setNumero_account(int numero_account ) {
		this.numero_account+=numero_account;
	}
	public void setidentite_numerique(int identite_numerique ) {
		this.identite_numerique+=identite_numerique;
	}
	public void setamount(int amount) {
		this.amount+=amount;
	}
	public void setcurrency(String currency) {
		this.currency+=currency;
	}
	
	// show the balnce;
	public void showBalance() {
		System.out.println("Bonjour"+ " "+ proprietaire+" "+ "Votre solde est de"+" " 
		+amount + currency+" "+ "Votre identite numerique est"+" "+identite_numerique
		+ " "+ "Votre numero de compte est" + " "+numero_account);
	}

	
	

}
