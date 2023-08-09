import androidx.compose.ui.window.ComposeUIViewController
import org.brucemcrooster.teamtrack.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController {
    return ComposeUIViewController { App() }
}
