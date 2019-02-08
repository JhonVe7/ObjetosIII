package ConceptosBPOO;

public class TiposDatosOO 
{
	public static void main(String[] args) 
	{
		float precio = 5000f,  tam = 15.5f , peso = 0.157f;
		String color = "Negro", textura = "Rigido";
		
		/*Marcador1 m = new Marcador1(precio, tam, peso, color, textura);
		System.out.println(m.precio + "\n" + m.tam + "\n" + m.peso + "\n" + m.color + "\n" + m.textura);*/
		
		Marcador2 m = new Marcador2();
		m.setPrecio(precio);
		m.setTam(tam);
		m.setPeso(peso);
		m.setColor(color);
		m.setTextura(textura);
		System.out.println(m.getPrecio()+" "+m.getTam()+" "+ m.getPeso()+" "+m.getColor()+" "+m.getTextura() );
	}
}

class Marcador1
{
	float precio, tam, peso;
	String color, textura;
	
	public Marcador1(float precio, float tam, float peso, String color, String textura) 
	{
		this.precio = precio;
		this.tam = tam;
		this.peso = peso;
		this.color = color;
		this.textura = textura;
	}
}

class Marcador2
{
	float precio, tam, peso;
	String color, textura;
	
	public Marcador2()
	{
		
	}

	public float getPrecio()
	{
		return precio;
	}

	public void setPrecio(float precio) 
	{
		this.precio = precio;
	}

	public float getTam() 
	{
		return tam;
	}

	public void setTam(float tam) 
	{
		this.tam = tam;
	}

	public float getPeso() 
	{
		return peso;
	}

	public void setPeso(float peso) 
	{
		this.peso = peso;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public String getTextura() 
	{
		return textura;
	}

	public void setTextura(String textura) 
	{
		this.textura = textura;
	}
}
