package dev.havlicektomas.rally

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import dev.havlicektomas.rally.ui.components.RallyTabRow
import dev.havlicektomas.rally.ui.screens.RallyScreens
import dev.havlicektomas.rally.ui.theme.RallyTheme
import org.junit.Rule
import org.junit.Test

class TopAppBarTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun rallyTopAppBarTest() {
        val allScreens = RallyScreens.values().toList()

        composeTestRule.setContent {
            RallyTheme {
                RallyTabRow(
                    allScreens = allScreens,
                    onTabSelected = { /*TODO*/ },
                    currentScreen = RallyScreens.Accounts
                )
            }
        }

//        composeTestRule
//            .onNodeWithContentDescription(RallyScreens.Accounts.name)
//            .assertIsSelected()

        composeTestRule.onRoot().printToLog("currentLabelExists")

        composeTestRule
            .onNodeWithContentDescription(RallyScreens.Accounts.name)
            .assertExists()
    }
}