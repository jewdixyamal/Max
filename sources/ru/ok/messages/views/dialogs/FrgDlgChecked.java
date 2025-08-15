package ru.ok.messages.views.dialogs;

import androidx.fragment.app.a;

public abstract class FrgDlgChecked<T> extends FrgDlgBase {
    public final void l1(q5 q5Var) {
        this.B1 = false;
        Object obj = this.I0;
        if (obj == null) {
            obj = b0();
        }
        String str = "activity";
        if (obj == null) {
            String name = getClass().getName();
            a aVar = this.I0;
            if (aVar != null) {
                str = "fragment";
            }
            throw new IllegalStateException(zr6.l(k7d.k("Class ", name, " should be call from ", str, ", but "), aVar != null ? "getParentFragment()" : "getActivity()", " is null"));
        } else if (!n1().isAssignableFrom(obj.getClass())) {
            String name2 = getClass().getName();
            if (this.I0 != null) {
                str = "fragment";
            }
            String name3 = n1().getName();
            StringBuilder k = k7d.k("Class ", name2, " must be attach to ", str, " that implements ");
            k.append(name3);
            throw new IllegalStateException(k.toString());
        }
    }

    public abstract Class n1();
}
