package negocio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author iapereira
 */
public class DataIgor {

    public final int dia;
    public final int mes;
    public final int ano;

    public DataIgor() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1900;
    }

    public DataIgor(int x, int y, int z) {
        if (x >= 1 && x <= 31 && y >= 1 && y <= 12 && z >= 1900) {
            if (y == 2 && this.ehBissexto(z) && x>=1 && x<=29) {
                this.dia = x;
            }
            else if (y == 2 && !this.ehBissexto(z) && x>=1 && x<=28) {
                this.dia = x;
            } else {
                this.dia = x;
            }              
            this.mes = y;
            this.ano = z;
        } 
        else if (z >= 1 && z <= 31 && y >= 1 && y <= 12 && x >= 1900) {
            this.dia = z;
            this.mes = y;
            this.ano = x;        
        } else {
            throw new IllegalArgumentException("Formato invalido de data.");
        }
      
    }

    @Override
    public String toString() {
        String resultado = "";
        if (this.dia < 10) {
            resultado += "0" + this.dia + "/";
        } else {
            resultado += this.dia + "/";
        }
        if (this.mes < 10) {
            resultado += "0" + this.mes + "/";
        } else {
            resultado += this.mes + "/";
        }
        resultado += this.ano;
        return resultado;
    }

    @Override
    public boolean equals(Object obj) {
        final DataIgor other = (DataIgor) obj;
        if (this.dia != other.dia) {
            return false;
        }
        if (this.mes != other.mes) {
            return false;
        }
        return this.ano == other.ano;
    }

    public int fatorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Numero negativo n pode");
        }
        if (x == 0 || x == 1) {
            return 1;
        }
        return x * fatorial(x - 1);
    }
    
    public boolean ehBissexto(){
        if (this.ano % 400 == 0 || ((this.ano % 4 == 0) && (this.ano % 100 != 0))) return true;
        return false;
    }
    
     public boolean ehBissexto(int z){
        if (z % 400 == 0 || ((z % 4 == 0) && (z % 100 != 0))) return true;
        return false;
    }

}
