import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material3.Icon

@Composable
fun OutlineLoginform(
    label: String,
    icon: ImageVector,
    contentDescription: String = "",
    modifier: Modifier = Modifier
) { var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it},
        label = { Text(label) },
        modifier = Modifier.fillMaxWidth(),
        trailingIcon = {
            Icon(imageVector = icon, contentDescription = contentDescription)
        }
    )
}