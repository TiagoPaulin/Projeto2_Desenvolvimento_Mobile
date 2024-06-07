package com.example.projeto2_somativa.view.menuComponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize

@Composable
fun DifficultySelector(onSelect : (String) -> Unit) {

    val difficulties = listOf("fácil", "média", "difícil")

    var selectedItem by remember { mutableStateOf("") }
    var isExpanded by remember { mutableStateOf(false) }
    var textFieldSize by remember { mutableStateOf(Size.Zero) }

    val icon = if (isExpanded) {

        Icons.Filled.KeyboardArrowUp

    } else {

        Icons.Filled.KeyboardArrowDown

    }

    Box(

        modifier = Modifier
            .padding(20.dp)
            .size(300.dp, 60.dp)

    ) {

        OutlinedTextField(

            value = selectedItem,
            onValueChange = { selectedItem = it },
            modifier = Modifier
                .fillMaxSize()
                .onGloballyPositioned { coordinates ->

                    textFieldSize = coordinates.size.toSize()

                },
            label = { Text(text = "Selecione uma dificuldade") },
            trailingIcon = { Icon(icon, "", Modifier.clickable { isExpanded = !isExpanded } ) },
            readOnly = true

        )

        DropdownMenu(

            expanded = isExpanded,
            onDismissRequest = { isExpanded = false },
            modifier = Modifier.width(with(LocalDensity.current) { textFieldSize.width.toDp() })

        ) {

            difficulties.forEach { difficulty ->

                DropdownMenuItem(

                    text = { Text(text = difficulty) },
                    onClick = {

                        selectedItem = difficulty
                        isExpanded = false
                        onSelect(selectedItem)

                    }

                )

            }

        }

    }

}