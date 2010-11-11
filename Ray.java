public class Ray {
	Vector3f o, dir;

	public Ray(){
		o = new Vector3f();
		dir = new Vector3f();
	}

	public Ray(Vector3f o, Vector3f dir){
		this.o = o;
		this.dir = dir;
	}

	public Ray(float a, float b, float c, float x, float y, float z){
		o = new Vector3f(a,b,c);
		dir = new Vector3f(x,y,z);
	}

	public Vector3f at(float t){
		return dir.multi(t).add(o);	
	}
}
