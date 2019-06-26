/* Java script function to control the tab */
function openCity(evt, actionName) {
  var i, tabcontent, tablinks;
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }
  document.getElementById(actionName).style.display = "block";
  evt.currentTarget.className += " active";
}

$('.datepicker').datepicker({
    format: 'dd/mm/yyyy',
    startDate: '0d'
});