package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Droppable_Accept_Page extends BasePage {

	@FindBy(id = "draggable-nonvalid-accept")
	private WebElement draggableFirstElement;

	@FindBy(id = "draggable-accept")
	private WebElement draggableSecondElement;

	@FindBy(id = "droppable-accept")
	private WebElement droppableElement;

	public void dragAndDrop(WebElement draggableElement) {
		actions.dragAndDrop(draggableElement, droppableElement).perform();
	}

	public String getDroppableElementText() {
		return droppableElement.getText();
	}

	public int getLocationOfDroppableX() {
		return droppableElement.getLocation().getX();
	}

	public int getLocationOfDroppableY() {
		return droppableElement.getLocation().getY();
	}

	public int getLocationOfDraggableX(WebElement draggableElement) {
		return draggableElement.getLocation().getX();
	}

	public int getLocationOfDraggableY(WebElement draggableElement) {
		return draggableElement.getLocation().getY();
	}

	public int getDroppableElementRightEdge() {
		return droppableElement.getLocation().getX() + droppableElement.getSize().getWidth();
	}

	public int getDroppableElementBottomEdge() {
		return droppableElement.getLocation().getY() + droppableElement.getSize().getHeight();
	}

	public int getDroppableElementLeftEdge() {
		return droppableElement.getLocation().getX();
	}

	public int getDroppableElementTopEdge() {
		return droppableElement.getLocation().getY();
	}

	public int getDraggableElementRightEdge(WebElement draggableElement) {
		return draggableElement.getLocation().getX() + draggableElement.getSize().getWidth();
	}

	public int getDraggableElementBottomEdge(WebElement draggableElement) {
		return draggableElement.getLocation().getY() + draggableElement.getSize().getHeight();
	}

	public int getDraggableElementLeftEdge(WebElement draggableElement) {
		return draggableElement.getLocation().getX();
	}

	public int getDraggableElementTopEdge(WebElement draggableElement) {
		return draggableElement.getLocation().getY();
	}

	public WebElement getDraggableFirstElement() {
		return draggableFirstElement;
	}

	public WebElement getDraggableSecondElement() {
		return draggableSecondElement;
	}

}
