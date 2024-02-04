package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.sound.sampled.Line;

public class WebAutomationPage extends BasePage {

	@FindBy(linkText = "Draggable")
	private WebElement draggableLink;

	@FindBy(linkText = "Default Functionality")
	private WebElement defaultFunctionalityLink;

	@FindBy(linkText = "Auto Scrolling")
	private WebElement autoScrollingLink;

	@FindBy(linkText = "Constrain Movement")
	private WebElement constrainMovementLink;

	@FindBy(linkText = "Handles")
	private WebElement handlesLink;

	@FindBy(linkText = "Droppable")
	private WebElement droppableLink;

	@FindBy(linkText = "Accept")
	private WebElement acceptLink;

	@FindBy(linkText = "Revert draggable position")
	private WebElement revertDraggablePositionLink;

	@FindBy(linkText = "Resizable")
	private WebElement resizableLink;

	@FindBy(linkText = "Synchronus Resize")
	private WebElement resizableSynchronusResizeLink;

	@FindBy(linkText = "Textarea")
	private WebElement resizableTextAreaLink;

	@FindBy(linkText = "Selectable")
	private WebElement selectableLink;

	@FindBy(linkText = "Serialize")
	private WebElement serializeLink;

	@FindBy(linkText = "Iframe")
	private WebElement iframeLink;

	@FindBy(linkText = "Nested Iframe")
	private WebElement nestedIframeLink;

	@FindBy(linkText = "Normal Iframe")
	private WebElement normalIframeLink;

	@FindBy(linkText = "Alerts")
	private WebElement alertsLink;

	@FindBy(linkText = "Animate")
	private WebElement animateLink;

	@FindBy(linkText = "Autocomplete")
	private WebElement autoCompleteLink;

	@FindBy(linkText = "Multiple & Remote")
	private WebElement multipleAndRemoteLink;

	@FindBy(linkText = "Accent Folding")
	private WebElement acceptFoldingLink;

	@FindBy(linkText = "Menu")
	private WebElement menuLink;

	@FindBy(linkText = "Icons")
	private WebElement iconsLink;

	@FindBy(linkText = "Progress Bar")
	private WebElement progressBarLink;

	@FindBy(linkText = "Download Dialog")
	private WebElement downloadDialogLink;

	@FindBy(linkText = "Control Group")
	private WebElement controlGroupLink;

	@FindBy(linkText = "Toolbar")
	private WebElement toolBarLink;

	@FindBy(linkText = "Datepicker")
	private WebElement datePickerLink;

	@FindBy(linkText = "Display Multiple Months")
	private WebElement displayMultipleMonthsLink;

	@FindBy(linkText = "Select Date Range")
	private WebElement selectDateRangeLink;

	@FindBy(linkText = "Dialog")
	private WebElement dialogLink;

	@FindBy(linkText = "Modal Form")
	private WebElement modalFormLink;

	@FindBy(linkText = "Slider")
	private WebElement sliderLink;

	@FindBy(linkText = "Snap to increments")
	private WebElement snapToIncrementsLink;

	@FindBy(linkText = "Spinner")
	private WebElement spinnerLink;

	@FindBy(linkText = "Spinner Overflow")
	private WebElement spinnerOverflowLink;

	@FindBy(linkText = "Sortable")
	private WebElement sortableLink;

	@FindBy(linkText = "Display as Grid")
	private WebElement displayAsGrid;

	@FindBy(linkText = "Include / exclude items")
	private WebElement includeAndExcludeItemsLink;

	@FindBy(linkText = "Checkbox Radio")
	private WebElement checkboxRadioLink;
	@FindBy(linkText = "Product Selector")
	private WebElement productSelectorLink;

	@FindBy(linkText = "Accordion")
	private WebElement accordionLink;

	@FindBy(linkText = "Collapse Content")
	private WebElement collapseContentLink;

	public void clickOnDraggableLink() {
		draggableLink.click();
	}

	public void clickOnDraggableDefaultFunctionalityLink() {
		defaultFunctionalityLink.click();
	}

	public void clickOnDraggableConstrainMovementLink() {
		constrainMovementLink.click();
	}

	public void clickOnDraggableHandlesLink() {
		handlesLink.click();
	}

	public void clickOnDroppableDefaultFunctionalityLink() {
		defaultFunctionalityLink.click();
	}

	public void clickOnDroppableAcceptLink() {
		acceptLink.click();
	}

	public void clickOnDroppableRevertDraggablePositionLink() {
		revertDraggablePositionLink.click();
	}

	public void clickOnDroppableLink() {
		droppableLink.click();
	}

	public void clickOnAutoScrollingLink() {
		autoScrollingLink.click();
	}

	public void clickOnResizableLink() {
		resizableLink.click();
	}

	public void clickOnResizableDefaultFuncLink() {
		defaultFunctionalityLink.click();
	}

	public void clickOnResizableSynchronusResizeLink() {
		resizableSynchronusResizeLink.click();
	}

	public void clickOnResizableTextAreaLink() {
		resizableTextAreaLink.click();
	}

	public void clickOnSelectableLink() {
		selectableLink.click();
	}

	public void clickOnDefaultFunctionality() {
		defaultFunctionalityLink.click();
	}

	public void clickOnSerializeLink() {
		serializeLink.click();
	}

	public void clickOnIframeLink() {
		iframeLink.click();
	}

	public void clickOnNestedIframe() {
		nestedIframeLink.click();
	}

	public void clickOnAlertsLink() {
		alertsLink.click();
	}

	public void clickOnAnimateLink() {
		animateLink.click();
	}

	public void clickOnNormalIframeLink() {
		normalIframeLink.click();
	}

	public void clickOnAutoCompleteLink() {
		autoCompleteLink.click();
	}

	public void clickOnMultipleAndRemoteLink() {
		multipleAndRemoteLink.click();
	}

	public void clickOnAccentFoldingLink() {
		acceptFoldingLink.click();
	}

	public void clickOnIconLink() {
		iconsLink.click();
	}

	public void clickOnMenuLink() {
		menuLink.click();
	}

	public void clickOnProgressBarLink() {
		progressBarLink.click();
	}

	public void clickOnDownloadDialogLink() {
		downloadDialogLink.click();
	}

	public void clickOnControlGroupLink() {
		controlGroupLink.click();
	}

	public void clickOnToolBarLink() {
		toolBarLink.click();
	}

	public void clickOnDatepicker() {
		datePickerLink.click();
	}

	public void clickOnDisplayMultipleMonths() {
		displayMultipleMonthsLink.click();
	}

	public void clickOnSelectDateRange() {
		selectDateRangeLink.click();
	}

	public void clickOnDialogLink(){
		dialogLink.click();
	}
	public void clickOnModalFormLink(){
		modalFormLink.click();
	}
	public void clickOnSliderLink(){sliderLink.click();}
	public void clickOnSnapToIncrementsLink(){snapToIncrementsLink.click();}
	public void clickOnSpinnerLink(){spinnerLink.click();}
	public void clickOnSpinnerOverflowLink(){spinnerOverflowLink.click();}
	public void clickOnSortableLink(){sortableLink.click();}
	public void clickOnDisplayAsGridLink(){displayAsGrid.click();}
	public void clickOnIncludeAndExcludeItemsLink(){includeAndExcludeItemsLink.click();}
	public void clickOnCheckboxRadioLink(){checkboxRadioLink.click();}
	public void clickOnProductSelector(){productSelectorLink.click();}

	public void clickOnAccordionLink(){accordionLink.click();}
	public void clickOnCollapseContentLink(){collapseContentLink.click();}
}
