package storm.commonlib.common.http.baseHttpBean;

import java.util.List;

public class ListResponse<T> extends BaseResponse<List<T>> {
    public long timestamp;
    public long total;
    public long offset;

    public List<T> getResult() {
        return data;
    }

    public void setResult(List<T> data) {
        this.data = data;
    }
}
