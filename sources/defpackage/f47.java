package defpackage;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;

/* renamed from: f47  reason: default package */
public final class f47 implements TextWatcher {
    public int X;
    public int Y;
    public final boolean Z;
    public final zua a;
    public boolean b = false;
    public boolean c;
    public dt o;
    public int s0 = 0;
    public int t0 = 0;

    public f47(zua zua, String str, int i, int i2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.a = zua;
        b(i, str);
        this.Z = true;
        this.Y = i2;
    }

    public final String a(CharSequence charSequence) {
        this.o.f();
        String str = "+" + this.X;
        boolean z = this.Z;
        if (z || (charSequence.length() > 0 && charSequence.charAt(0) != '0')) {
            charSequence = str + charSequence;
        }
        int length = charSequence.length();
        char c2 = 0;
        String str2 = "";
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (PhoneNumberUtils.isNonSeparator(charAt)) {
                if (c2 != 0) {
                    str2 = this.o.i(c2);
                }
                c2 = charAt;
            }
        }
        if (c2 != 0) {
            str2 = this.o.i(c2);
        }
        String trim = str2.trim();
        if (z || charSequence.length() == 0 || charSequence.charAt(0) != '0') {
            trim = trim.length() > str.length() ? trim.charAt(str.length()) == ' ' ? trim.substring(str.length() + 1) : trim.substring(str.length()) : "";
        }
        return TextUtils.isEmpty(trim) ? "" : trim;
    }

    public final synchronized void afterTextChanged(Editable editable) {
        try {
            if (!this.b) {
                int selectionEnd = Selection.getSelectionEnd(editable);
                boolean z = false;
                int i = 0;
                for (int i2 = 0; i2 < editable.length(); i2++) {
                    if (PhoneNumberUtils.isNonSeparator(editable.charAt(i2))) {
                        i++;
                    }
                }
                int i3 = this.Y;
                if (i > i3) {
                    int i4 = i - i3;
                    int max = Math.max(this.s0 + this.t0, 1) - 1;
                    this.b = true;
                    while (max < editable.length() && i4 > 0) {
                        if (PhoneNumberUtils.isNonSeparator(editable.charAt(max))) {
                            editable.delete(max, max + 1);
                            i4--;
                        } else {
                            max++;
                        }
                    }
                    this.b = false;
                } else if (this.c) {
                    if (editable.length() != 0) {
                        z = true;
                    }
                    this.c = z;
                } else {
                    boolean z2 = selectionEnd == editable.length();
                    String a2 = a(editable);
                    if (!a2.equals(editable.toString())) {
                        if (!z2) {
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                if (i5 >= editable.length()) {
                                    break;
                                } else if (i5 >= selectionEnd) {
                                    break;
                                } else {
                                    if (PhoneNumberUtils.isNonSeparator(editable.charAt(i5))) {
                                        i6++;
                                    }
                                    i5++;
                                }
                            }
                            selectionEnd = 0;
                            int i7 = 0;
                            while (true) {
                                if (selectionEnd >= a2.length()) {
                                    selectionEnd = 0;
                                    break;
                                } else if (i7 == i6) {
                                    break;
                                } else {
                                    if (PhoneNumberUtils.isNonSeparator(a2.charAt(selectionEnd))) {
                                        i7++;
                                    }
                                    selectionEnd++;
                                }
                            }
                        } else {
                            selectionEnd = a2.length();
                        }
                    }
                    if (!z2) {
                        while (true) {
                            int i8 = selectionEnd - 1;
                            if (i8 > 0 && !PhoneNumberUtils.isNonSeparator(a2.charAt(i8))) {
                                selectionEnd--;
                            }
                        }
                    }
                    this.b = true;
                    editable.replace(0, editable.length(), a2, 0, a2.length());
                    this.b = false;
                    Selection.setSelection(editable, selectionEnd);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void b(int i, String str) {
        this.X = i;
        zua zua = this.a;
        zua.getClass();
        dt dtVar = new dt(zua, str);
        this.o = dtVar;
        dtVar.f();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.b && !this.c && i2 > 0) {
            for (int i4 = i; i4 < i + i2; i4++) {
                if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                    this.c = true;
                    this.o.f();
                    return;
                }
            }
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.s0 = i;
        this.t0 = i3;
        if (!this.b && !this.c && i3 > 0) {
            for (int i4 = i; i4 < i + i3; i4++) {
                if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                    this.c = true;
                    this.o.f();
                    return;
                }
            }
        }
    }
}
