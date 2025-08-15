package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import ru.ok.messages.views.dialogs.ConfirmationDialog;

/* renamed from: pg3  reason: default package */
public final /* synthetic */ class pg3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmationDialog b;

    public /* synthetic */ pg3(ConfirmationDialog confirmationDialog, int i) {
        this.a = i;
        this.b = confirmationDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                ConfirmationDialog confirmationDialog = this.b;
                Bundle bundle = confirmationDialog.Z;
                Bundle bundle2 = bundle != null ? bundle.getBundle("oneme:share:data") : null;
                confirmationDialog.f0().e0("ConfirmationDialog:request_key", dy7.g(new kpa("POSITIVE", rg3.a)));
                a i0 = confirmationDialog.i0(true);
                if (i0 == null) {
                    b b0 = confirmationDialog.b0();
                    if (b0 instanceof qg3) {
                        ((qg3) b0).R(bundle2);
                    } else if (b0 instanceof q5) {
                        Intent intent = new Intent();
                        intent.putExtra("oneme:share:data", bundle2);
                        ((q5) b0).onActivityResult(confirmationDialog.j0(), -1, intent);
                    }
                } else if (i0 instanceof qg3) {
                    ((qg3) i0).R(bundle2);
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("oneme:share:data", bundle2);
                    i0.s0(confirmationDialog.j0(), -1, intent2);
                }
                confirmationDialog.B1 = true;
                return;
            default:
                this.b.l1();
                return;
        }
    }
}
