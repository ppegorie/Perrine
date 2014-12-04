package perrine;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mes Documents
 */
public class Lapin {
    private String nom;
    private int age;
    
    public Lapin(String n, int a)
    {
        nom = n;
        age = a;
    }
    
    public void setNom (String n2)
    {
        nom = n2;
    }
    
    public String getNom()
    {
        return nom;
    }
    
    public void setAge(int a2)
    {
        age = a2;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void crie()
    {
        System.out.println("HAAAAAAAAA");
    }
    
}
