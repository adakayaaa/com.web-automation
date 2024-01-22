package utils;

import pages.Datepicker.DisplayMultipleMonths_Page;
import pages.Datepicker.SelectDateRange;
import pages.HomePage;
import pages.WebAutomationPage;
import pages.alerts.AlertTypes_Page;
import pages.autoComplete.AccentFolding_Page;
import pages.autoComplete.MultipleAndRemote_Page;
import pages.controlGroup.ToolBar_Page;
import pages.dialog.Modal_Form_Page;
import pages.draggable.AutoScrolling_Page;
import pages.draggable.ConstrainMovement_Page;
import pages.draggable.Draggable_DefFunc_Page;
import pages.draggable.Handles_Page;
import pages.droppable.Droppable_Accept_Page;
import pages.droppable.Droppable_DefFunc_Page;
import pages.droppable.Droppable_RevertDraggablePosition_Page;
import pages.iframe.NestedIframe_Page;
import pages.iframe.NormalIframe_Page;
import pages.menu.Icons_Page;
import pages.progressBar.DownloadDialog_Page;
import pages.resizable.Animate_Page;
import pages.resizable.Resizable_DefFunc_Page;
import pages.resizable.Resizable_SynchronusResize_Page;
import pages.resizable.Resizable_TextArea_Page;
import pages.selectable.Selectable_DefFunc_Page;
import pages.selectable.Selectable_Seriliaze_Page;

public class Pages {

	private AccentFolding_Page accentFoldingPage;

	private AlertTypes_Page alertTypesPage;

	private Animate_Page animatePage;

	private AutoScrolling_Page autoScrollingPage;

	private ConstrainMovement_Page constrainMovementPage;

	private DisplayMultipleMonths_Page displayMultipleMonthsPage;

	private DownloadDialog_Page downloadDialogPage;

	private Draggable_DefFunc_Page draggableDefFuncPage;

	private Droppable_Accept_Page droppableAcceptPage;

	private Droppable_DefFunc_Page droppableDefFuncPage;

	private Droppable_RevertDraggablePosition_Page droppableRevertDraggablePositionPage;

	private Handles_Page handlesPage;

	private HomePage homePage;

	private Icons_Page iconsPage;
	private Modal_Form_Page modalFormPage;

	private MultipleAndRemote_Page multipleAndRemotePage;

	private NestedIframe_Page nestedIframePage;

	private NormalIframe_Page normalIframePage;

	private Resizable_DefFunc_Page resizableDefFuncPage;

	private Resizable_SynchronusResize_Page resizableSynchronusResizePage;

	private Resizable_TextArea_Page resizableTextAreaPage;

	private Selectable_DefFunc_Page selectableDefFuncPage;

	private Selectable_Seriliaze_Page selectableSeriliazePage;

	private SelectDateRange selectDateRange;

	private ToolBar_Page toolBarPage;

	private WebAutomationPage webAutomationPage;

	public Pages() {
		homePage = new HomePage();
		webAutomationPage = new WebAutomationPage();
		draggableDefFuncPage = new Draggable_DefFunc_Page();
		autoScrollingPage = new AutoScrolling_Page();
		droppableDefFuncPage = new Droppable_DefFunc_Page();
		resizableDefFuncPage = new Resizable_DefFunc_Page();
		resizableSynchronusResizePage = new Resizable_SynchronusResize_Page();
		resizableTextAreaPage = new Resizable_TextArea_Page();
		selectableDefFuncPage = new Selectable_DefFunc_Page();
		nestedIframePage = new NestedIframe_Page();
		alertTypesPage = new AlertTypes_Page();
		animatePage = new Animate_Page();
		constrainMovementPage = new ConstrainMovement_Page();
		handlesPage = new Handles_Page();
		droppableAcceptPage = new Droppable_Accept_Page();
		droppableRevertDraggablePositionPage = new Droppable_RevertDraggablePosition_Page();
		selectableSeriliazePage = new Selectable_Seriliaze_Page();
		normalIframePage = new NormalIframe_Page();
		multipleAndRemotePage = new MultipleAndRemote_Page();
		accentFoldingPage = new AccentFolding_Page();
		iconsPage = new Icons_Page();
		downloadDialogPage = new DownloadDialog_Page();
		toolBarPage = new ToolBar_Page();
		displayMultipleMonthsPage = new DisplayMultipleMonths_Page();
		selectDateRange = new SelectDateRange();
		modalFormPage=new Modal_Form_Page();

	}

	public HomePage getHomePage() {
		return homePage;
	}

	public WebAutomationPage getWebAutomationPage() {
		return webAutomationPage;
	}

	public Draggable_DefFunc_Page getDraggableDefFuncPage() {
		return draggableDefFuncPage;
	}

	public AutoScrolling_Page getAutoScrollingPage() {
		return autoScrollingPage;
	}

	public Droppable_DefFunc_Page getDroppableDefFuncPage() {
		return droppableDefFuncPage;
	}

	public Resizable_DefFunc_Page getResizableDefFuncPage() {
		return resizableDefFuncPage;
	}

	public Selectable_DefFunc_Page getSelectableDefFuncPage() {
		return selectableDefFuncPage;
	}

	public NestedIframe_Page getNestedIframePage() {
		return nestedIframePage;
	}

	public AlertTypes_Page getAlertTypesPage() {
		return alertTypesPage;
	}

	public Animate_Page getAnimatePage() {
		return animatePage;
	}

	public ConstrainMovement_Page getConstrainMovementPage() {
		return constrainMovementPage;
	}

	public Handles_Page getHandlesPage() {
		return handlesPage;
	}

	public Droppable_Accept_Page getDroppableAcceptPage() {
		return droppableAcceptPage;
	}

	public Droppable_RevertDraggablePosition_Page getDroppableRevertDraggablePositionPage() {
		return droppableRevertDraggablePositionPage;
	}

	public Resizable_SynchronusResize_Page getResizableSynchronusResizePage() {
		return resizableSynchronusResizePage;
	}

	public Resizable_TextArea_Page getResizableTextAreaPage() {
		return resizableTextAreaPage;
	}

	public Selectable_Seriliaze_Page getSelectableSeriliazePage() {
		return selectableSeriliazePage;
	}

	public NormalIframe_Page getNormalIframePage() {
		return normalIframePage;
	}

	public MultipleAndRemote_Page getMultipleAndRemotePage() {
		return multipleAndRemotePage;
	}

	public AccentFolding_Page getAccentFoldingPage() {
		return accentFoldingPage;
	}

	public Icons_Page getIconsPage() {
		return iconsPage;
	}

	public DownloadDialog_Page getDownloadDialogPage() {
		return downloadDialogPage;
	}

	public ToolBar_Page getToolBarPage() {
		return toolBarPage;
	}

	public DisplayMultipleMonths_Page getDisplayMultipleMonthsPage() {
		return displayMultipleMonthsPage;
	}

	public SelectDateRange getSelectDateRange() {
		return selectDateRange;
	}
	public Modal_Form_Page getModalFormPage(){return modalFormPage;}

}
