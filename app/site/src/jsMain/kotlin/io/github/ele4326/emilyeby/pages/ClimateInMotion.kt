package io.github.ele4326.emilyeby.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.alignContent
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.*
import com.varabyte.kobweb.core.layout.Layout
import com.varabyte.kobweb.core.layout.NoLayout
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobwebx.frontmatter.*
import com.varabyte.kobwebx.markdown.*
import io.github.ele4326.emilyeby.components.sections.Footer
import io.github.ele4326.emilyeby.components.sections.NavHeader
import io.github.ele4326.emilyeby.toSitePalette
import org.jetbrains.compose.web.css.AlignContent

@Page("/climateInMotion")
@Composable
fun ClimateInMotionPage() {
    Column(modifier =
        Modifier
            .fillMaxWidth()
            .alignContent(AlignContent.Center)
            .backgroundColor(ColorMode.current.toSitePalette().darkBackground)
    ) {
        NavHeader()
        Footer()
    }
}