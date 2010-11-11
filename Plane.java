public class Plane extends Shape {
	Vector3f p,n;

	public Plane(Vector3f p, Vector3f n){
		this.p = p;
		this.n = n;
	}

	public Plane(float px, float py, float pz, float nx, float ny, float nz){
		p = new Vector3f(px,py,pz);
		n = new Vector3f(nx,ny,nz);
	}

	public boolean intersect(Ray ray){
		float d = ray.dir.dot(n);
		if(d >= 0)
			return false;
		else{
			t = -(ray.o.dot(n))/d;
			return true;
		}
	}

	public boolean checkBBox(Ray ray){
		return true;
	}
}
