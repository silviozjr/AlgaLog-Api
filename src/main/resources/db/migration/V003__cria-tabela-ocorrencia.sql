create table ocorrencia (
	id serial not null,
	entrega_id bigint not null,
	descricao text not null,
	data_registro timestamp with time zone not null,
	
	primary key(id)
);

alter table ocorrencia add constraint fk_ocorrencia_entrega
foreign key (entrega_id) references entrega (id)