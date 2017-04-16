import java.util.ArrayList;
import java.util.List;


public class Field {
	private List<List<Tensor>> tensorField = new ArrayList<List<Tensor>>();
	
	public Field(int width, int height){
		for(int i = 0; i < width; i++){
			tensorField.add(new ArrayList<Tensor>());
			for(int j = 0; j < height; j++){
				tensorField.get(i).add(new Tensor(i, j));
			}
		}
	}

}
