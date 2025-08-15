package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import com.google.android.material.ComGoogleAndroidMaterialR$style;

public class FrgDlgPermissions extends FrgDlgBase {
    public static final int G1 = jpc.f3;
    public static final int H1 = jpc.I;
    public boolean F1;

    public static FrgDlgPermissions n1(String[] strArr, int i, int i2, int i3, boolean z) {
        FrgDlgPermissions frgDlgPermissions = new FrgDlgPermissions();
        Bundle bundle = new Bundle();
        bundle.putStringArray("ru.ok.tamtam.extra.PERMISSIONS", strArr);
        bundle.putInt("ru.ok.tamtam.extra.POSITIVE_BUTTON", i3);
        bundle.putInt("ru.ok.tamtam.extra.TITLE", i);
        bundle.putInt("ru.ok.tamtam.extra.CONTENT", i2);
        bundle.putBoolean("ru.ok.tamtam.extra.MODE_SETTINGS", z);
        frgDlgPermissions.X0(bundle);
        return frgDlgPermissions;
    }

    public final Dialog h1() {
        Bundle T0 = T0();
        this.F1 = T0.getBoolean("ru.ok.tamtam.extra.MODE_SETTINGS");
        int i = T0.getInt("ru.ok.tamtam.extra.CONTENT");
        int i2 = T0.getInt("ru.ok.tamtam.extra.TITLE", G1);
        int i3 = T0.getInt("ru.ok.tamtam.extra.POSITIVE_BUTTON", H1);
        s08 s08 = new s08(new du3(U0(), ComGoogleAndroidMaterialR$style.Theme_MaterialComponents));
        oc ocVar = s08.a;
        ocVar.d = ocVar.a.getText(i2);
        s08.b(i);
        s08 d = s08.d(i3, new v46(this, 0));
        oc ocVar2 = d.a;
        ocVar2.m = false;
        if (this.F1) {
            int i4 = jpc.Y1;
            v46 v46 = new v46(this, 1);
            ocVar2.k = ocVar2.a.getText(i4);
            ocVar2.l = v46;
        }
        return d.create();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        b b0 = b0();
        if (b0 instanceof w46) {
            ((w46) b0).d();
        }
        a aVar = this.I0;
        if (aVar instanceof w46) {
            ((w46) aVar).d();
        }
    }
}
