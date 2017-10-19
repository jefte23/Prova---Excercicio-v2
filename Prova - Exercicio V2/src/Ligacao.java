import java.time.LocalDateTime;

public class Ligacao {

	private int codigo;
	private String TelefoneDestino;
	private LocalDateTime DataHoraInicio;
	private LocalDateTime DataHoraFim;
	private String cidadeDestino;
	private String UFDestino;
	private Cliente clientes;

	@Override
	public String toString() {
		return "Ligacao [codigo=" + codigo + ", TelefoneDestino=" + TelefoneDestino + ", DataHoraInicio="
				+ DataHoraInicio + ", DataHoraFim=" + DataHoraFim + ", cidadeDestino=" + cidadeDestino + ", UFDestino="
				+ UFDestino + ", clientes=" + clientes + "]";
	}

	public Ligacao(int codigo, String telefoneDestino, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			String cidadeDestino, String uFDestino, Cliente clientes) {
		super();
		this.codigo = codigo;
		TelefoneDestino = telefoneDestino;
		DataHoraInicio = dataHoraInicio;
		DataHoraFim = dataHoraFim;
		this.cidadeDestino = cidadeDestino;
		UFDestino = uFDestino;
		this.clientes = clientes;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTelefoneDestino() {
		return TelefoneDestino;
	}

	public void setTelefoneDestino(String telefoneDestino) {
		TelefoneDestino = telefoneDestino;
	}

	public LocalDateTime getDataHoraInicio() {
		return DataHoraInicio;
	}

	public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
		DataHoraInicio = dataHoraInicio;
	}

	public LocalDateTime getDataHoraFim() {
		return DataHoraFim;
	}

	public void setDataHoraFim(LocalDateTime dataHoraFim) {
		DataHoraFim = dataHoraFim;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	public String getUFDestino() {
		return UFDestino;
	}

	public void setUFDestino(String uFDestino) {
		UFDestino = uFDestino;
	}

	public Cliente getClientes() {
		return clientes;
	}

	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}

}
