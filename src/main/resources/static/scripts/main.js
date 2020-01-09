
/* Repair DropDowns*/
$('#category').on('change', function() {
    let Category = this.value;

    let interiorArray = '<option value="-" style="display:none;">-</option><option value="Painting">Painting</option><option value="Electrical">Electrical</option><option value="Plumbing">Plumbing</option><option value="Insulation">Insulation</option><option value="Fireplace">Fireplace</option><option value="Frames">Frames</option><option value="Ceramic Flooring">Ceramic Flooring</option><option value="Ceiling">Ceiling</option>';

    let exteriorArray= '<option value="-" style="display:none;">-</option><option value="Solar Panels">Solar Panels</option><option value="Swimming Pool">Swimming Pool</option><option value="Fences">Fences</option><option value="Painting">Painting</option>';


    let repairType = $('#type');

    if (Category == "Interior"){
    repairType .empty().append(interiorArray );
    }
    else if (Category == "Exterior"){
    repairType .empty().append(exteriorArray);
    }
});

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


