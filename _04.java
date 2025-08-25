	package programs;
	public class _04{
		public static void main(String [] args) {
			Car obj = new Car( "BMW", "Blue");
			obj.start();
			obj.stop();
		}
	}
	
	 class Car{
		String model,color;
		Car(String model, String color){
			this.model = model;
			this.color = color;
		}
		
		public static void start() {
			
			System.out.println("Car started");
		}
		
		public static void stop() {
			System.out.println("Car stopped");
		}
	}