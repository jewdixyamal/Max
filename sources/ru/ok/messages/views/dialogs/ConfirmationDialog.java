package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.a;
import androidx.fragment.app.b;

public final class ConfirmationDialog extends DialogFragment {
    public boolean B1;

    public final Dialog h1() {
        int i;
        int i2;
        int i3;
        int i4;
        Bundle T0 = T0();
        String string = T0.getString("ru.ok.tamtam.extra.TITLE");
        CharSequence charSequence = T0.getCharSequence("ru.ok.tamtam.extra.CONTENT");
        String string2 = T0.getString("ru.ok.tamtam.extra.POSITIVE_TEXT");
        String string3 = T0.getString("ru.ok.tamtam.extra.NEGATIVE_TEXT");
        if (TextUtils.isEmpty(string) && (i4 = T0.getInt("ru.ok.tamtam.extra.TITLE_RES_ID")) != 0) {
            string = h0(i4);
        }
        if (TextUtils.isEmpty(charSequence) && (i3 = T0.getInt("ru.ok.tamtam.extra.CONTENT_RES_ID")) != 0) {
            charSequence = h0(i3);
        }
        if (TextUtils.isEmpty(string2) && (i2 = T0.getInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID")) != 0) {
            string2 = h0(i2);
        }
        if (TextUtils.isEmpty(string3) && (i = T0.getInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID")) != 0) {
            string3 = h0(i);
        }
        s08 e = new s08(U0()).e(string);
        oc ocVar = e.a;
        ocVar.f = charSequence;
        pg3 pg3 = new pg3(this, 0);
        ocVar.g = string2;
        ocVar.h = pg3;
        pg3 pg32 = new pg3(this, 1);
        ocVar.k = string3;
        ocVar.l = pg32;
        return e.create();
    }

    public final void l1() {
        if (!this.B1) {
            Bundle bundle = this.Z;
            Bundle bundle2 = bundle != null ? bundle.getBundle("oneme:share:data") : null;
            f0().e0("ConfirmationDialog:request_key", dy7.g(new kpa("NEGATIVE", rg3.b)));
            a i0 = i0(true);
            if (i0 == null) {
                b b0 = b0();
                if (b0 instanceof qg3) {
                    ((qg3) b0).getClass();
                } else if (b0 instanceof q5) {
                    Intent intent = new Intent();
                    intent.putExtra("oneme:share:data", bundle2);
                    ((q5) b0).onActivityResult(j0(), 0, intent);
                }
            } else if (i0 instanceof qg3) {
                qg3 qg3 = (qg3) i0;
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("oneme:share:data", bundle2);
                i0.s0(j0(), 0, intent2);
            }
            this.B1 = true;
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        l1();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        l1();
    }
}
