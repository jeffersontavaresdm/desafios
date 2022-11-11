package desafios.desafio_10.solucoes.solucao_02;

class No {
  private Integer idx;
  private final Integer valor;
  private Integer anteriorIdx;
  private Integer proximoIdx;

  public No(Integer idx, Integer valor, Integer anteriorIdx, Integer proximoIdx) {
    this.idx = idx;
    this.valor = valor;
    this.anteriorIdx = anteriorIdx;
    this.proximoIdx = proximoIdx;
  }

  public void setProximoIdx(Integer valor) {
    this.proximoIdx = valor;
  }

  public void setAnteriorIdx(Integer anteriorIdx) {
    this.anteriorIdx = anteriorIdx;
  }

  public Integer getValor() {
    return valor;
  }

  public Integer getAnteriorIdx() {
    return anteriorIdx;
  }

  public Integer getProximoIdx() {
    return proximoIdx;
  }

  public Integer getIdx() {
    return idx;
  }

  public void setIdx(Integer idx) {
    this.idx = idx;
  }

  @Override
  public String toString() {
    return "No[idx: " + idx + ", valor: " + getValor() + ", anterior_idx: " + getAnteriorIdx() + ", proximo_idx: " + getProximoIdx();
  }
}