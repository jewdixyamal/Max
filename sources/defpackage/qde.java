package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* renamed from: qde  reason: default package */
public final class qde extends ActionMode {
    public final Context a;
    public final j7 b;

    public qde(Context context, j7 j7Var) {
        this.a = context;
        this.b = j7Var;
    }

    public final void finish() {
        this.b.a();
    }

    public final View getCustomView() {
        return this.b.b();
    }

    public final Menu getMenu() {
        return new rr8(this.a, this.b.c());
    }

    public final MenuInflater getMenuInflater() {
        return this.b.d();
    }

    public final CharSequence getSubtitle() {
        return this.b.e();
    }

    public final Object getTag() {
        return this.b.b;
    }

    public final CharSequence getTitle() {
        return this.b.f();
    }

    public final boolean getTitleOptionalHint() {
        return this.b.a;
    }

    public final void invalidate() {
        this.b.g();
    }

    public final boolean isTitleOptional() {
        return this.b.h();
    }

    public final void setCustomView(View view) {
        this.b.i(view);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.b.k(charSequence);
    }

    public final void setTag(Object obj) {
        this.b.b = obj;
    }

    public final void setTitle(CharSequence charSequence) {
        this.b.m(charSequence);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.b.n(z);
    }

    public final void setSubtitle(int i) {
        this.b.j(i);
    }

    public final void setTitle(int i) {
        this.b.l(i);
    }
}
