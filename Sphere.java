public class Sphere extends Shape{
	public float a,b,c,r;

	public Sphere(float a, float b, float c, float r){
		this.a = a;
		this.b = b;
		this.c = c;
		this.r = r;
	}

	boolean intersect(Ray ray){
		float a = Vector3f.dot(ray.dir,ray.dir);
		float b = 2 * Vector3f.dot(ray.dir, ray.o);
		float c = Vector3f.dot(ray.o, ray.o) - (r * r);

		float disc = b*b - 4*a*c;
		float discSqrt = (float)Math.sqrt(disc);
		float q;
		if(b < 0)
			q = (-b - discSqrt)/2.0f;
		else
			q = (-b + discSqrt)/2.0f;

		float t0 = q / a;
		float t1 = c / q;

		if(t0 > t1){
			float temp = t0;
			t0 = t1;
			t1 = temp;
		}
	
		if(t1 < 0)
			return false;

		if(t0 < 0){
			t = t1;
			return true;
		}
		else{
			t = t0;
			return true;
		}
	}
}

