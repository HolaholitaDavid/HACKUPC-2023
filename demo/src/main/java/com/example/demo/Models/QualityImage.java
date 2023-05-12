package com.example.demo.Models;

public class QualityImage {
    private Response response;
    private String correleation_id;
    private String version;
    private String error;
    private String time;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public String getCorreleation_id() {
        return correleation_id;
    }

    public void setCorreleation_id(String correleation_id) {
        this.correleation_id = correleation_id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
