/* Copyright 2016 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */
function onClick() {
  if (inputsAreEmpty()) {
    label.textContent = 'Error: one or both inputs are empty.';
    return;
  }
//   Entrada para imprimir en pantalla el error de NaN
  if (inputsAreLetters()){
    label.textContent = 'Error: one or both inputs are not a number.';
    return;
  }
  updateLabel();
}

function inputsAreLetters() {
// funcion para verificar si los inputs son NaN
  if (isNaN(getNumber1()) || isNaN(getNumber2())) {
    return true;
  } else {
    return false;
  }
}
function inputsAreEmpty() {
  if (getNumber1() === '' || getNumber2() === '') {
    return true;
  } else {
    return false;
  }
}
function updateLabel() {
//     Se cambia el tipo a floats
  var addend1 = parseFloat(getNumber1());
  var addend2 = parseFloat(getNumber2());
  var sum = addend1 + addend2;
  label.textContent = addend1 + ' + ' + addend2 + ' = ' + sum;
}
function getNumber1() {
  return inputs[0].value;
}
function getNumber2() {
  return inputs[1].value;
}
var inputs = document.querySelectorAll('input');
var label = document.querySelector('p');
var button = document.querySelector('button');
button.addEventListener('click', onClick);
