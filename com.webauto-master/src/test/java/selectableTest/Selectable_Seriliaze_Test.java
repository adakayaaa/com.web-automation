package selectableTest;

import BaseTest.Hooks;
/**
 * 1. Open the browser and navigate to the URL
 * 2. Click on webautomation link
 * 3. Click on Selectable button
 * 4. Click on Serialize button
 * 5. Click on Item 5
 * 6. Verify that Item 5 is selected
 * 7. Verify that "You've selected: #5" is displayed
 * 8. Click on Item 6
 * 9. Verify that Item 6 is selected
 * 10. Verify that "You've selected: #6" is displayed
 * 11. Click on Item 1, Item 3 by holding down the Ctrl key
 * 12. Verify that Item 1, Item 3 are selected
 * 13. Verify that "You've selected: #1 #3 #6" is displayed(6 selected because Item 6 is still selected)
 * 14. Click on Item 1, Item2, Item 3 by holding mouse down and dragging
 * 15. Verify that Item 1, Item 2, Item 3 are selected
 * 16. Verify that "You've selected: #1 #2 #3" is displayed
 */
public class Selectable_Seriliaze_Test extends Hooks {
}
