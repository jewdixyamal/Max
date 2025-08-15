package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import ru.ok.messages.views.dialogs.FrgDlgPermissions;

/* renamed from: v46  reason: default package */
public final /* synthetic */ class v46 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgDlgPermissions b;

    public /* synthetic */ v46(FrgDlgPermissions frgDlgPermissions, int i) {
        this.a = i;
        this.b = frgDlgPermissions;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FrgDlgPermissions frgDlgPermissions = this.b;
        switch (this.a) {
            case 0:
                if (frgDlgPermissions.F1) {
                    b b0 = frgDlgPermissions.b0();
                    if (b0 instanceof w46) {
                        ((w46) b0).x();
                    }
                    a aVar = frgDlgPermissions.I0;
                    if (aVar instanceof w46) {
                        ((w46) aVar).x();
                        return;
                    }
                    return;
                } else if (frgDlgPermissions.T0().getBoolean("use.result.api", false)) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("dialog:permissions:result", true);
                    frgDlgPermissions.f0().e0(frgDlgPermissions.L0, bundle);
                    return;
                } else {
                    String[] stringArray = frgDlgPermissions.T0().getStringArray("ru.ok.tamtam.extra.PERMISSIONS");
                    a i0 = frgDlgPermissions.i0(true);
                    if (i0 != null) {
                        wmd.D(i0, stringArray, frgDlgPermissions.j0());
                        return;
                    }
                    b b02 = frgDlgPermissions.b0();
                    if (b02 != null) {
                        int j0 = frgDlgPermissions.j0();
                        String[] strArr = wmd.d;
                        z7.O(b02, stringArray, j0);
                        wmd.H(wmd.r(b02), stringArray);
                        return;
                    }
                    return;
                }
            default:
                int i2 = FrgDlgPermissions.G1;
                b b03 = frgDlgPermissions.b0();
                if (b03 != null) {
                    String[] strArr2 = wmd.d;
                    b03.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", b03.getPackageName(), (String) null)));
                }
                b b04 = frgDlgPermissions.b0();
                if (b04 instanceof w46) {
                    ((w46) b04).v();
                }
                a aVar2 = frgDlgPermissions.I0;
                if (aVar2 instanceof w46) {
                    ((w46) aVar2).v();
                    return;
                }
                return;
        }
    }
}
