package model;
import java.util.List;

public class User {

	
	private Integer Idcollum;
	
	public Integer getId() 
	{
		return Idcollum;		
	}
	
	private String Namecollum; 
	
	public String getNome() 
	{
		return Namecollum;
	}
	
	public void setNome (String nome) 
	{
	Namecollum = nome;		
	}
	
	private String TelefoneCollum;

	public String getTelefone() 
	{
	   return  TelefoneCollum;
	}	
	public void setTelefone (String telefone)
	{	
		TelefoneCollum = telefone;	
	}
	
	
	private String EmailCollum;
	
	public String getEmail() 
	{
	   return  EmailCollum;
	}
	
	public void setEmail (String email)
	{	
		EmailCollum = email;	
	}
	
	@Override
	public String toString() 
	{
		return "Nome: " + Namecollum + ", Telefone: " + TelefoneCollum + ", Email: " + EmailCollum + "";
		
	}
	
	public User(Integer id,String  telefone , String  email,String  nome )
	{
		super();	
		Idcollum = id;
		TelefoneCollum =telefone;
		EmailCollum = email;
		Namecollum = nome;
	}
	
	public User() 
	{
		
	}
	
	public User findUser (Integer id,List<User>users)	
	{	
		{
			for (User user :users)
			{
				if (user.getId().equals(Idcollum))
				{
					return user;
				}			
			}
			return null;
		}
	}
}
