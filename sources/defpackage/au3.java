package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;

/* renamed from: au3  reason: default package */
public final class au3 extends TextView implements kre {
    public final /* synthetic */ ContextMenuPopupWindow a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public au3(jqe jqe, ContextMenuPopupWindow contextMenuPopupWindow, Context context) {
        super(context);
        this.a = contextMenuPopupWindow;
        i4f.l.b(this, du4.b);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        setText(jqe.b(getContext()));
        onThemeChanged(ContextMenuPopupWindow.m0(contextMenuPopupWindow));
    }

    public final void onThemeChanged(fka fka) {
        setTextColor(ContextMenuPopupWindow.m0(this.a).getText().h);
    }
}
