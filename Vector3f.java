public class Vector3f{
	public float x,y,z;

	public Vector3f(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3f(){
		x = 0.f;
		y = 0.f;
		z = 0.f;
	}

	public float length(){
		return (float)Math.sqrt(x*x + y*y + z*z);
	}

	public Vector3f normalize(){
		float l = length();
		return new Vector3f(x/l, y/l, z/l);	
	}

	public static Vector3f crossp(Vector3f a, Vector3f b){
		return new Vector3f(a.y*b.z-a.z*b.y, a.z*b.x-a.x*b.z, a.x*b.y-a.y*b.x); 
	}

	public String toString(){
		return new String("[ " + x + " , " + y + " , " + z + " ]");
	}

	public Vector3f add(Vector3f i){
		return new Vector3f(x+i.x, y+i.y, z+i.z);
	}

	public Vector3f sub(Vector3f i){
		return new Vector3f(x-i.x, y-i.y, z-i.z);
	}

	public float dot(Vector3f b){
		return x * b.x + y * b.y + z * b.z;
	}

	public static float dot(Vector3f a, Vector3f b){
		return a.x * b.x + a.y * b.y + a.z * b.z;
	}
}
