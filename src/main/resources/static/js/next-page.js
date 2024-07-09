const formSection = document.querySelector('.form-section');

// Функция за показване на следващата форма
function showNextForm() {
    const currentForm = formSection.querySelector('.form-page.active');
    const nextForm = currentForm.nextElementSibling;
    if (nextForm) {
        currentForm.classList.remove('active');
        nextForm.classList.add('active');
    }
}

// Функция за показване на предишната форма
function showPreviousForm() {
    const currentForm = formSection.querySelector('.form-page.active');
    const previousForm = currentForm.previousElementSibling;
    if (previousForm) {
        currentForm.classList.remove('active');
        previousForm.classList.add('active');
    }
}

// Приложете събитията към бутоните за следваща страница
formSection.addEventListener('click', function(event) {
    if (event.target.classList.contains('next-button')) {
        showNextForm();
    }
});

// Приложете събитията към бутоните за предишна страница
formSection.addEventListener('click', function(event) {
    if (event.target.classList.contains('prev-button')) {
        showPreviousForm();
    }
});