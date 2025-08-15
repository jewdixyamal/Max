package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: lg3  reason: default package */
public final class lg3 {
    public final Bundle a;

    public lg3(jqe jqe, Bundle bundle, wuc wuc) {
        Bundle bundle2 = new Bundle();
        this.a = bundle2;
        bundle2.putParcelable("title", jqe);
        bundle2.putBundle(ApiProtocol.PARAM_PAYLOAD, bundle);
        if (wuc != null) {
            bundle2.putString("stat_screen", wuc.name());
        }
    }

    public final void a(mg3... mg3Arr) {
        Bundle bundle = this.a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        d63.X(parcelableArrayList, mg3Arr);
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void b(int i, eqe eqe) {
        Bundle bundle = this.a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        parcelableArrayList.add(new mg3(i, eqe, 1, false));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void c(int i, eqe eqe) {
        Bundle bundle = this.a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        parcelableArrayList.add(new mg3(i, eqe, 2, false));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void d(int i, eqe eqe) {
        Bundle bundle = this.a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        parcelableArrayList.add(new mg3(i, eqe, 3, false));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final ConfirmationBottomSheet e() {
        return new ConfirmationBottomSheet(this.a);
    }

    public final void f(jqe jqe) {
        Bundle bundle = this.a;
        if (jqe == null) {
            bundle.remove("description");
        } else {
            bundle.putParcelable("description", jqe);
        }
    }
}
