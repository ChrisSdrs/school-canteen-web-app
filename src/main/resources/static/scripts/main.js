/* Delete Confirmation Pop-up */
$('#deleteConfirmationModal').on('show.bs.modal', function(event) {

    let $tableRow = $(event.relatedTarget).closest('[data-id]');

    let id = $tableRow.data('id');
    let link = $tableRow.data('link');
    let $titleElement = $('.modal-title');

    $titleElement.text((index, text) => {
        return text = `Confirm delete #${id}`;
    });

    let $modalDeleteButton = $('.modal-action');
    let $modalForm = $('#deleteForm');

    $modalDeleteButton.attr('data-id', id);
    $modalForm.attr('action', link);

});


