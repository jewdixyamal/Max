package one.me.devmenu.server;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/devmenu/server/ServerPortBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ServerPortBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] B0;
    public final q7c A0 = viewBinding(zvb.server_port_custom_btn);
    public final je7 y0 = createViewModelLazy(l6b.class, new jp8(26, new hbc(16)));
    public final q7c z0 = viewBinding(zvb.server_port_input);

    static {
        Class<ServerPortBottomSheet> cls = ServerPortBottomSheet.class;
        B0 = new bc7[]{new hob(cls, "customInput", "getCustomInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), zr6.e(nec.a, cls, "customButton", "getCustomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    }

    public ServerPortBottomSheet() {
        super((Bundle) null, 1, (z84) null);
    }

    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText("Порт сервера");
        i4f.c.b(textView, du4.b);
        textView.setTextColor(qp4.u0.j(textView).getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        float f2 = (float) 16;
        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        cka cka = new cka(linearLayout.getContext());
        cka.setId(zvb.server_port_input);
        cka.setText(((t33) ((q33) ((l6b) this.y0.getValue()).b.getValue())).E());
        cka.setLayoutParams(new ti3(-1, -2));
        cka.setBackgroundColorAttr(Integer.valueOf(wfa.L));
        cka.setHint("Введите кастомный порт");
        cka.setInputType(2);
        EditText editText = cka.a;
        z2 z2Var = new z2(9, this);
        editText.addTextChangedListener(z2Var);
        editText.addTextChangedListener(z2Var);
        linearLayout.addView(cka);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(zvb.server_port_custom_btn);
        ti3 ti3 = new ti3(-1, -2);
        ti3.topMargin = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(ti3);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText((CharSequence) "Установить");
        tu0.K(oneMeButton, 300, new v7d(this, 0, oneMeButton));
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }
}
