package defpackage;

import android.net.Uri;

/* renamed from: bl0  reason: default package */
public final class bl0 implements yk {
    public static final Uri X = sl.a("batch.executeV2");
    public final String a;
    public final il[] b;
    public final int c;
    public final gaa o;

    public bl0(String str, il[] ilVarArr, int i) {
        this.a = str;
        this.b = ilVarArr;
        this.c = i;
        this.o = new gaa((Object) ilVarArr);
    }

    public final za7 getOkParser() {
        return this.o;
    }

    public final int getPriority() {
        int i = this.c;
        int i2 = 1;
        if (1 <= i && i < 257) {
            return i;
        }
        for (il ilVar : this.b) {
            int priority = ilVar.b.getPriority();
            if (i2 < priority) {
                i2 = priority;
            }
        }
        return i2;
    }

    public final kl getScope() {
        il[] ilVarArr = this.b;
        int length = ilVarArr.length;
        kl klVar = kl.a;
        if (length == 0) {
            return klVar;
        }
        if (length == 1) {
            return ilVarArr[0].b.getScope();
        }
        for (il ilVar : ilVarArr) {
            kl scope = ilVar.b.getScope();
            if (klVar.compareTo(scope) < 0) {
                klVar = scope;
            }
            if (ilVar.b.getScopeAfter() != ll.a) {
                break;
            }
        }
        return klVar;
    }

    public final ll getScopeAfter() {
        il[] ilVarArr = this.b;
        int length = ilVarArr.length;
        ll llVar = ll.a;
        if (length == 0) {
            return llVar;
        }
        if (length == 1) {
            return ilVarArr[0].b.getScopeAfter();
        }
        for (int i = length - 1; -1 < i; i--) {
            ll scopeAfter = ilVarArr[i].b.getScopeAfter();
            if (scopeAfter != llVar) {
                return scopeAfter;
            }
        }
        return llVar;
    }

    public final Uri getUri() {
        return X;
    }

    public final boolean shouldGzip() {
        for (il ilVar : this.b) {
            if (ilVar.b.shouldGzip()) {
                return true;
            }
        }
        return false;
    }

    public final boolean shouldPost() {
        return true;
    }

    public final void writeParams(kb7 kb7) {
        String str = this.a;
        if (str != null) {
            kb7.g0("id");
            kb7.i(str);
        }
        kb7.g0("methods");
        kb7.u();
        for (il ilVar : this.b) {
            yk ykVar = ilVar.b;
            kb7.s();
            kb7.g0(ilVar.e);
            kb7.s();
            if (ykVar.willWriteParams()) {
                kb7.g0("params");
                kb7.s();
                ykVar.writeParams(kb7);
                kb7.q();
            }
            if (ykVar.willWriteSupplyParams()) {
                kb7.g0("supplyParams");
                kb7.s();
                ykVar.writeSupplyParams(kb7);
                kb7.q();
            }
            if (ilVar.c) {
                kb7.g0("onError");
                kb7.i("SKIP");
            }
            String str2 = ilVar.d;
            if (str2 != null) {
                kb7.g0("condition");
                kb7.i(str2);
            }
            kb7.q();
            kb7.q();
        }
        kb7.t();
    }
}
