package one.me.sdk.transfer.exceptions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/sdk/transfer/exceptions/HttpErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "transfer_release"}, k = 1, mv = {2, 0, 0})
public class HttpErrorException extends Exception {
    public final eq6 a;
    public final String b;

    public HttpErrorException() {
        this((String) null, (eq6) null, (String) null, 7);
    }

    public final String toString() {
        StringBuilder m = au1.m("HttpErrorException(msg='", getMessage(), "', error='");
        m.append(this.a);
        m.append("', response='");
        return zr6.l(m, this.b, "')");
    }

    public HttpErrorException(String str, eq6 eq6) {
        this(str, eq6, (String) null, 4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HttpErrorException(String str, eq6 eq6, String str2, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : eq6, (i & 4) != 0 ? null : str2);
    }

    public HttpErrorException(String str, eq6 eq6, String str2) {
        super(str);
        this.a = eq6;
        this.b = str2;
    }
}
