package defpackage;

import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;

/* renamed from: h0d  reason: default package */
public abstract class h0d {
    public static void a(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    public static void b(SearchView$SearchAutoComplete searchView$SearchAutoComplete, int i) {
        searchView$SearchAutoComplete.setInputMethodMode(i);
    }
}
