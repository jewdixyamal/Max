package one.me.sdk.phoneutils;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ListIterator;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/sdk/phoneutils/SelectCountryBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "phone-utils_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class SelectCountryBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ int y0 = 0;

    public SelectCountryBottomSheet(Bundle bundle) {
        super(bundle);
    }

    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(View.generateViewId());
        textView.setText(yoc.b0);
        i4f.c.b(textView, du4.b);
        textView.setTextColor(qp4.u0.j(textView).getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        float f2 = (float) 16;
        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        boolean z = getArgs().getBoolean("is_narnia_available");
        eaa eaa = daa.a;
        kl7 l = j1e.l();
        l.add(daa.b);
        l.add(daa.a);
        if (z) {
            l.add((eaa) daa.c.getValue());
        }
        ListIterator listIterator = j1e.d(l).listIterator(0);
        while (true) {
            il7 il7 = (il7) listIterator;
            if (!il7.hasNext()) {
                return linearLayout;
            }
            eaa eaa2 = (eaa) il7.next();
            ny3 ny3 = new ny3(linearLayout.getContext());
            ny3.setCountryInfo(eaa2);
            tu0.K(ny3, 300, new vu5(this, 28, eaa2));
            linearLayout.addView(ny3);
        }
    }
}
